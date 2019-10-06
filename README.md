![N|Solid](https://img.shields.io/badge/language-kotlin-orange)
![N!Solid](https://img.shields.io/badge/release-0.4-blue)
![N|Solid](https://img.shields.io/twitter/follow/hiteshpatel1142?label=Twitter)

# LinkableLogApp
The power of android logcat, now developer can jump right to the log printed from.

## Easy to Intsall 

```bash
implementation 'com.github.dhl:linkablelog:0.4'
```

## Usage
```python
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.github.dhl.linkablelog.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun printSampleLog() {
        Log.d("SimpleLog","Click here to see code")
    }
}
