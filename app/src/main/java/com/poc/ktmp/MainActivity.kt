package com.poc.ktmp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()

        val scope = CoroutineScope(Job() + Dispatchers.Main)

        scope.launch {
            val result = withContext(Dispatchers.IO) { getRequest() }
            findViewById<TextView>(R.id.main_text).text = result
        }
    }
}