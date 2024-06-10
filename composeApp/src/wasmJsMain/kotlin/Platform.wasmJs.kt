class WasmPlatform: Platform {
    override val name: String = "Web with Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()