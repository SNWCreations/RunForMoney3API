package snw.rfm.api.util.hook;

import snw.rfm.api.game.pack.GamePack;

record RegisteredHookHandler<T>(GamePack handle, T handler) {
}
