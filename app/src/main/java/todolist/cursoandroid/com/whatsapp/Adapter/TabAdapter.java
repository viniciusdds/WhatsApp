package todolist.cursoandroid.com.whatsapp.Adapter;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import todolist.cursoandroid.com.whatsapp.fragment.ContatosFragment;
import todolist.cursoandroid.com.whatsapp.fragment.ConversasFragment;

public class TabAdapter extends FragmentStatePagerAdapter {

    private String[] tituloAbas = {"CONVERSAS", "CONTATOS"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0:
                fragment = new ConversasFragment();
                break;
            case 1:
                fragment = new ContatosFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return tituloAbas.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tituloAbas[position];
    }
}
