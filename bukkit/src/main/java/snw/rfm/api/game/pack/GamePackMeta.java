package snw.rfm.api.game.pack;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public record GamePackMeta(
        @SerializedName("identifier")
        String identifier,
        @SerializedName("pack_format")
        int packVersion,
        @SerializedName("script_language")
        String scriptLanguage,
        @SerializedName("entrypoint")
        String entrypoint,
        @SerializedName("authors")
        List<String> authors
) implements IGamePackMeta {
}
