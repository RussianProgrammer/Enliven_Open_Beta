package sis.pewpew.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sis.pewpew.MainActivity;
import sis.pewpew.R;

public class GratitudeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //ОГРОМНОЕ СПАСИБО ВСЕМ ТЕМ, КТО ПОМОГАЛ МНЕ В СОЗДАНИИ ПРОЕКТА ЛЮБЫМ СПОСОБОМ.
        //ДЛЯ МЕНЯ ЭТО ПО-НАСТОЯЩЕМУ ОЧЕНЬ ВАЖНО.

        ((MainActivity) getActivity()).setActionBarTitle(getString(R.string.gratitude_fragment_name));
        return inflater.inflate(R.layout.fragment_gratitude, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
