package ink.reactor.zlib;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class ZlibSupplier {

    private static final byte SUPPORTED = 1, UNCHECKED = -1, NOT_SUPPORTED = 0;

    private static byte supportIGZip; 

    static {
        final String os = System.getProperty("os.name");
        supportIGZip = os.equals("Linux") ? UNCHECKED : NOT_SUPPORTED;
    }

    public static ZLib createZlib() throws ZlibException {
        if (supportIGZip == NOT_SUPPORTED) {
            return new JavaZlib();
        }

        if (supportIGZip == SUPPORTED) {
            final ZLib zlib = IsalZlib.create();
            if (zlib == null) {
                return new JavaZlib();
            }
            return zlib;
        }

        if (supportIGZip == UNCHECKED) {
            try {
                final ZLib igzip = IsalZlib.create();
                supportIGZip = SUPPORTED;
                return igzip;
            } catch (final Exception e) {
                supportIGZip = NOT_SUPPORTED;
                throw new ZlibException("Can't create a instance of igzip. Disabling and using default java zlib", e);
            }
        }
        return new JavaZlib();
    }
}