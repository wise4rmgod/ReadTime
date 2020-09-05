package com.dev.readtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ty =
            "The coinlayer API's live endpoint is used to get the latest crypto rates for all available or a specific set of cryptocurrencies. " +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +

                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +

                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                    "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options."
        // Read Time Logic
        //  text.text = ReadTime.readtime(ty)

        minread.text = ReadTime.readtime(ty)

    }
}