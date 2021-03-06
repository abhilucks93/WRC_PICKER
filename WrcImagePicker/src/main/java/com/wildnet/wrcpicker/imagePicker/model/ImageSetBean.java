

package com.wildnet.wrcpicker.imagePicker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ImageSetBean implements Serializable {
    public String name;
    public String path;
    public ImageItemBean cover;
    public ArrayList<ImageItemBean> imageItems;

    @Override
    public boolean equals(Object o) {
        try {
            ImageSetBean other = (ImageSetBean) o;
            return this.path.equalsIgnoreCase(other.path) && this.name.equalsIgnoreCase(other.name);
        }catch (ClassCastException e){
            e.printStackTrace();
        }
        return super.equals(o);
    }

}
