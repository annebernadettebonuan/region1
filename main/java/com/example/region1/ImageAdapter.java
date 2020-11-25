package com.example.region1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds; //this is just placeholder
    //LA UNION
    private int[] machoTemple = new int[] {R.drawable.lu_l_mt_1, R.drawable.lu_l_mt_2, R.drawable.lu_l_mt_3};
    private int[] balayNaBato = new int[] {R.drawable.lu_l_bb_1, R.drawable.lu_l_bb_2, R.drawable.lu_l_bb_3};
    private int[] tangadanFalls = new int[] {R.drawable.lu_l_tf_1, R.drawable.lu_l_tf_2, R.drawable.lu_l_tf_3};
    private int[] urbiztondoBeach = new int[] {R.drawable.lu_l_ub_1, R.drawable.lu_l_ub_2, R.drawable.lu_l_ub_3};
    private int[] lunaWatchTower = new int[] {R.drawable.lu_l_lwt_1, R.drawable.lu_l_lwt_2, R.drawable.lu_l_lwt_3};
    private int[] olasBanditos = new int[] {R.drawable.lu_r_ob_1, R.drawable.lu_r_ob_2, R.drawable.lu_r_ob_3};
    private int[] madMonkeys = new int[] {R.drawable.lu_r_mm_1, R.drawable.lu_r_mm_2, R.drawable.lu_r_mm_3};
    private int[] surfShack = new int[] {R.drawable.lu_r_ss_1, R.drawable.lu_r_ss_2};
    private int[] tagpuan = new int[] {R.drawable.lu_r_t_1, R.drawable.lu_r_t_2};
    private int[] halohalo = new int[] {R.drawable.lu_d_hhi_1, R.drawable.lu_d_hhi_2, R.drawable.lu_d_hhi_3};
    private int[] sabongFriedChicken = new int[] {R.drawable.lu_d_sfc_1, R.drawable.lu_d_sfc_2};
    private int[] dinengdengFestival = new int[] {R.drawable.lu_c_df_1, R.drawable.lu_c_df_2, R.drawable.lu_c_df_3};
    private int[] missLaUnion = new int[] {R.drawable.lu_c_mlu_1, R.drawable.lu_c_mlu_2, R.drawable.lu_c_mlu_3};
    //ILOCOS NORTE
        //create an array of all items in ilocos norte just like above, then go to giveArray() function
        //at the end of the code, and add a case [name of item] and follow the pattern on the previous cases
    //ILOCOS SUR
    //PANGASINAN

    ImageAdapter(Context context, String name){
        mContext = context;
        giveArray(name);
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((ImageView) object);
    }

    public void giveArray(String name){
        switch(name){
            //la union landmarks
            case "Ma-cho Temple":
                mImageIds = machoTemple;
                break;
            case "Balay na Bato":
                mImageIds = balayNaBato;
                break;
            case "Tangadan Falls":
                mImageIds = tangadanFalls;
                break;
            case "Urbiztondo Beach":
                mImageIds = urbiztondoBeach;
                break;
            case "Luna's Watch Tower":
                mImageIds = lunaWatchTower;
                break;
            //la union restaurants
            case "Olas Banditos":
                mImageIds = olasBanditos;
                break;
            case "Surf Shack":
                mImageIds = surfShack;
                break;
            case "Mad Monkeys":
                mImageIds = madMonkeys;
                break;
            case "Tagpuan sa San Juan":
                mImageIds = tagpuan;
                break;
            //la union delicacies
            case "Halo-Halo de Iloko":
                mImageIds = halohalo;
                break;
            case "Sabong Fried Chicken":
                mImageIds = sabongFriedChicken;
                break;
            //la union culture
            case "Dinengdeng Festival":
                mImageIds = dinengdengFestival;
                break;
            case "Miss La Union":
                mImageIds = missLaUnion;
                break;
            //ilocos norte landmarks
            //ilocos norte restaurants
            //ilocos norte delicacies
            //ilocos norte culture
            //ilocos sur landmarks
            //ilocos sur restaurants
            //ilocos sur delicacies
            //ilocos sur culture
            //pangasinan landmarks
            //pangasinan restaurants
            //pangasinan delicacies
            //pangasinan culture
        }
    }
}
