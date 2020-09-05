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

        val you = "f your audience reads slower or faster than 200 words per minute — \n" +
                "        perhaps your blog is in English, which isn’t your audience’s first language, or perhaps your material is extremely\n" +
                "        basic and easy to skim — then you’ll want to use calculator instead. First, you’ll have to divide your total word \n" +
                "        count by the average words read per minute of your audience. Let’s say your 938-word article has an audience that \n" +
                "        reads 150 words per minute. That gives you 6.253. Enter 6.253 into the Decimal-to-Time Calculator, choose “Minutes” \n" +
                "        from the drop-down menu and press “Calculate.”\n" +
                "        Immediately, you’ll get a minute and seconds estimate. In this case, it’s 6 minutes and 15 seconds."
        // Read Time Logic
        //  text.text = ReadTime.readtime(ty)
        wordct.text = ReadTime.countWords(ty).toString()

        minread.text = ReadTime.readtime(ty)

    }
}