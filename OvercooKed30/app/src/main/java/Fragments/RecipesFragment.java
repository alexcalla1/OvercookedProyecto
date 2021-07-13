// Proyecto Taypoy
// Fecha: 17/07/2020
// Alumnos:
// Christopher Bryan Avendaño Llanque
// Cardenas Rodriguez Fabrizzio Jorge
// Santos Pamo Bruno Andre
// Juan Ignacio Rodríguez Núñez
package Fragments;


import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;

import com.example.overcooked30.*;
import com.example.overcooked30.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecipesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecipesFragment extends Fragment {




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String urii = "https://firebasestorage.googleapis.com/v0/b/repositoriof-f8eca.appspot.com/o/trailer.mp4?alt=media&token=4a662de9-7038-4266-8c9c-4f501a14a045";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecipesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecipesFragment.
     */
    // TODO: Rename and change types and number of parameters



    public static RecipesFragment newInstance(String param1, String param2) {
        RecipesFragment fragment = new RecipesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }



    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_recipes, container, false);
        VideoView videoView = (VideoView) rootView.findViewById(R.id.vid);
        //TextView temp = (TextView) rootView.findViewById(R.id.for_message);
        //Bundle bundle = this.getArguments();
        //urii=bundle.getString("mensaje");

        MediaController mediaController = new MediaController(getActivity());
        Uri uri = Uri.parse(urii);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
        return rootView;

    }

    /*public void getDataFragments(String msg){
        urii=msg;
    }*/

}