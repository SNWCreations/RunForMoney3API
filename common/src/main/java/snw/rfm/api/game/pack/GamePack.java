package snw.rfm.api.game.pack;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public interface GamePack {
    IGamePackMeta getMeta();

    @Nullable URL getResourceURL(String path) throws MalformedURLException;

    @Nullable InputStream getResource(String path) throws IOException;
}
