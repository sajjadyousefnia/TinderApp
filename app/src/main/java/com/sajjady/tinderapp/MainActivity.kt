package com.sajjady.tinderapp

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.lorentzos.flingswipe.SwipeFlingAdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var al = ArrayList<String>()
    private var arrayAdapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        al.apply {
            add("php")
            add("c")
            add(("python"))
            add("java")
        }
        arrayAdapter = ArrayAdapter(this, R.layout.item, R.id.helloText, al)

        frame.adapter = arrayAdapter



frame.setFlingListener(object : SwipeFlingAdapterView.onFlingListener {
    override fun removeFirstObjectInAdapter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLeftCardExit(p0: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRightCardExit(p0: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAdapterAboutToEmpty(p0: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onScroll(p0: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

})






        flingContainer.setFlingListener(new SwipeFlingAdapterView . onFlingListener () {
            @Override
            public void removeFirstObjectInAdapter() {
                // this is the simplest way to delete an object from the Adapter (/AdapterView)
                Log.d("LIST", "removed object!");
                al.remove(0);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
                Toast.makeText(MyActivity.this, "Left!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightCardExit(Object dataObject) {
                Toast.makeText(MyActivity.this, "Right!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                // Ask for more data here
                al.add("XML ".concat(String.valueOf(i)));
                arrayAdapter.notifyDataSetChanged();
                Log.d("LIST", "notified");
                i++;
            }
        });

        // Optionally add an OnItemClickListener
        flingContainer.setOnItemClickListener(new SwipeFlingAdapterView . OnItemClickListener () {
            @Override
            public void onItemClicked(int itemPosition, Object dataObject) {
                makeToast(MyActivity.this, "Clicked!");
            }
        });
    }
}
}
