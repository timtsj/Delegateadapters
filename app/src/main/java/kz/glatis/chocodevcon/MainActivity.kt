package kz.glatis.chocodevcon

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kz.glatis.chocodevcon.adapter.AuthAdapter
import kz.glatis.chocodevcon.adapter.BookingAdapter
import kz.glatis.chocodevcon.adapter.TotalSumAdapter
import kz.glatis.chocodevcon.core.regular.CompositeAdapter
import kz.glatis.chocodevcon.model.AuthAdapterModel
import kz.glatis.chocodevcon.model.BookingAdapterModel
import kz.glatis.chocodevcon.model.TotalSumAdapterModel

class MainActivity : AppCompatActivity() {

    private val compositeAdapter by lazy {
        CompositeAdapter.Builder()
            .add(BookingAdapter())
            .add(TotalSumAdapter())
            .add(AuthAdapter())
            .build()
    }

    private val items by lazy {
        listOf(
            BookingAdapterModel(),
            TotalSumAdapterModel(),
            BookingAdapterModel(),
            AuthAdapterModel(),
            BookingAdapterModel()
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView.adapter = compositeAdapter
        compositeAdapter.swapData(items)
    }
}
