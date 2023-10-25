package com.example.notagps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {
    EditText txtLatitud, txtLongitud;
    GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud=findViewById(R.id.txt_latitud);
        txtLongitud=findViewById(R.id.txt_longitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);
        LatLng STArica = new LatLng(-18.483349968714816, -70.31038613288952);
        mMap.addMarker(new MarkerOptions().position(STArica).title("Santo Tomas Arica"));

        LatLng STIquique = new LatLng(-20.237123408424836, -70.14521028055265);
        mMap.addMarker(new MarkerOptions().position(STIquique).title("Santo Tomas Iquique"));

        LatLng STAntofagasta = new LatLng(-23.634662697683392, -70.39404187116351);
        mMap.addMarker(new MarkerOptions().position(STAntofagasta).title("Santo Tomas Antofagasta"));

        LatLng STLaSerena = new LatLng(-29.90849957513752, -71.25703308384482);
        mMap.addMarker(new MarkerOptions().position(STLaSerena).title("Santo Tomas La Serena"));

        LatLng STVinaDelMar = new LatLng(-33.03721841255039, -71.52212564374544);
        mMap.addMarker(new MarkerOptions().position(STVinaDelMar).title("Santo Tomas Vina del Mar"));

        LatLng STSantiago = new LatLng(-33.48668599560347, -70.6155269490212);
        mMap.addMarker(new MarkerOptions().position(STSantiago).title("Santo Tomas Santiago"));

        LatLng STTalca = new LatLng(-35.408290103691755, -71.6516618833674);
        mMap.addMarker(new MarkerOptions().position(STTalca).title("Santo Tomas Talca"));

        LatLng STConcepcion = new LatLng(-36.82609937178748, -73.06166442806092);
        mMap.addMarker(new MarkerOptions().position(STConcepcion).title("Santo Tomas Concepcion"));

        LatLng STLosAngeles = new LatLng(-37.471928447817305, -72.35398417377462);
        mMap.addMarker(new MarkerOptions().position(STLosAngeles).title("Santo Tomas Los Angeles"));

        LatLng STTemuco = new LatLng(-38.73081985415649, -72.60349294972897);
        mMap.addMarker(new MarkerOptions().position(STTemuco).title("Santo Tomas Temuco"));

        LatLng STValdivia = new LatLng(-39.81690691504058, -73.23180015315658);
        mMap.addMarker(new MarkerOptions().position(STValdivia).title("Santo Tomas Valdivia"));

        LatLng STOsorno = new LatLng(-40.571668528292, -73.1375113545849);
        mMap.addMarker(new MarkerOptions().position(STOsorno).title("Santo Tomas Osorno"));

        LatLng STPuertoMontt = new LatLng(-41.47250667865814, -72.928721716512);
        mMap.addMarker(new MarkerOptions().position(STPuertoMontt).title("Santo Tomas Puerto Montt"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(STArica));
    }
    @Override
    public void onMapClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
    @Override
    public void onMapLongClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
}