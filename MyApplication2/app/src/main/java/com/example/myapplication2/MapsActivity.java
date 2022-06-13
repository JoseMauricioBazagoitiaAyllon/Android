package com.example.myapplication2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication2.json.Geo;
import com.example.myapplication2.json.User;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.myapplication2.databinding.ActivityMapsBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    ArrayList<String> Latitud  = new ArrayList();
    ArrayList<String> Longitud  = new ArrayList();
    ArrayList<String> Nombres  = new ArrayList();

    private static final String TAG = "MisDatosLL";   // Declaramos para imprimir

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recovery(); // llamamos al metodo que lista los servicios

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

//        LatLng sucre = new LatLng(-19.033485, -65.258117);
//        mMap.addMarker(new MarkerOptions().position(sucre).title("Marker in Sucre"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sucre));
//
//
//        LatLng tarija = new LatLng(-21.532930, -64.735207);
//        mMap.addMarker(new MarkerOptions().position(tarija).title("Marker in Tarija"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(tarija));
//
//        LatLng santa = new LatLng(-17.783321, -63.182137);
//        mMap.addMarker(new MarkerOptions().position(santa).title("Marker in Santa Cruz"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(santa));
//
//        LatLng pando = new LatLng(-11.035200, -68.779767);
//        mMap.addMarker(new MarkerOptions().position(pando).title("Marker in Pando"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(pando));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-37.3159, 81.1496))
                .title("Marker"));

        for (int i = 0; i < Latitud.size(); i++) {
            //Toast.makeText(MapsActivity.this,i,Toast.LENGTH_LONG).show();
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(Float.valueOf(Latitud.get(i)), Float.valueOf(Longitud.get(i))))
                    .title(Nombres.get(i)));

            Log.i(TAG, " Latitud: "+Latitud.get(i)+" Longitud: "+Longitud.get(i) + " Ciudad: "+Nombres.get(i));
        }
    }

    public void recovery(){
        String URL = "https://jsonplaceholder.typicode.com/";
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        webServiceAPI serviceHubService = retrofit.create(webServiceAPI.class);
        final Call<List<User>> call = serviceHubService.getUsers();

        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if(response.isSuccessful()){
                    List<User> list = response.body();
                    String latitud = "";
                    for(User obj:list){
                        latitud += obj.getAddress().getGeo().getLat();
                        Latitud.add(obj.getAddress().getGeo().getLat());
                        Longitud.add(obj.getAddress().getGeo().getLng());
                        Nombres.add(obj.getAddress().getCity());
                    }
                    Toast.makeText(MapsActivity.this,latitud,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }
}
