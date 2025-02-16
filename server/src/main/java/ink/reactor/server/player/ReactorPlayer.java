package ink.reactor.server.player;

import java.util.UUID;

import ink.reactor.api.inventory.InventoryHolder;
import ink.reactor.api.player.Player;
import ink.reactor.api.player.connection.PlayerConnection;
import ink.reactor.api.player.data.PlayerInventory;
import ink.reactor.chat.component.ChatComponent;
import ink.reactor.chat.component.RawComponent;
import ink.reactor.chat.util.ComponentCombiner;
import ink.reactor.protocol.outbound.play.PacketOutSetTablist;
import ink.reactor.protocol.outbound.play.PacketOutSystemChat;

public final class ReactorPlayer extends Player implements InventoryHolder {

    private final ReactorPlayerInventory reactorPlayerInventory = new ReactorPlayerInventory(this);

    public ReactorPlayer(String name, UUID uuid, PlayerConnection connection) {
        super(connection, name, uuid);
    }

    @Override
    public void sendMessage(final String message) {
        sendMessage(new RawComponent(message));
    }

    @Override
    public void sendMessage(final String... messages) {
        final PacketOutSystemChat[] packets = new PacketOutSystemChat[messages.length];
        for (int i = 0; i < messages.length; i++) {
            packets[i] = new PacketOutSystemChat(new RawComponent(messages[i]));
        }
        getConnection().sendPackets(packets);
    }

    @Override
    public void sendMessage(final ChatComponent[] components) {
        getConnection().sendPackets(new PacketOutSystemChat(ComponentCombiner.toNBT(components)));  
    }

    @Override
    public void sendMessage(final ChatComponent component) {
        getConnection().sendPacket(new PacketOutSystemChat(component));
    }

    public PlayerInventory getInventory() {
        return reactorPlayerInventory;
    }

    @Override
    public void setTabHeaderFooter(final ChatComponent[] header, final ChatComponent[] footer) {
        getConnection().sendPacket(new PacketOutSetTablist(header, footer));
    }
}