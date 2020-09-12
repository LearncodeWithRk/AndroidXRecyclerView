package in.learncodewithrk.androidxrecyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView userRecycler;
    RecyclerviewAdapter recyclerviewAdapter;
    EditText searchView;
    CharSequence search="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.search_bar);

        List<UserData> userDataList = new ArrayList<>();
        userDataList.add(new UserData("jeans","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.jeans));
        userDataList.add(new UserData("top","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.top));
        userDataList.add(new UserData("shoes","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.shoes));
        userDataList.add(new UserData("vegetable","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.vegetable));
        userDataList.add(new UserData("fruit","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.fruit));
        userDataList.add(new UserData("chicken","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.chicken));
        userDataList.add(new UserData("fish","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.fish));
        userDataList.add(new UserData("top","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.top));
        userDataList.add(new UserData("shoes","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.shoes));
        userDataList.add(new UserData("fruit","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.fruit));
        userDataList.add(new UserData("chicken","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.chicken));
        userDataList.add(new UserData("vegetable","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.vegetable));
        userDataList.add(new UserData("fruit","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.fruit));
        userDataList.add(new UserData("fish","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.fish));
        userDataList.add(new UserData("top","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.top));
        userDataList.add(new UserData("shoes","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.shoes));



        setUserRecycler(userDataList);


        searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                recyclerviewAdapter.getFilter().filter(charSequence);
                search = charSequence;
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private  void  setUserRecycler(List<UserData> userDataList){
        userRecycler = findViewById(R.id.userRecycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        userRecycler.setLayoutManager(layoutManager);
        recyclerviewAdapter = new RecyclerviewAdapter(this, userDataList);
        userRecycler.setAdapter(recyclerviewAdapter);
    }

}