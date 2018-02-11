package demo

import kotlinx.coroutines.experimental.launch
import kotlin.concurrent.thread

(0..1_000_000).map {
        thread { println(it) }
}

(0..1_000_000).map {
        launch { println(it) }
}