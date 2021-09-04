package com.chihuasdevs.phone_field.interfaces;

import android.view.View;
import android.widget.AdapterView;

import com.chihuasdevs.phone_field.Countries;
import com.chihuasdevs.phone_field.Country;

/**
 * Interface definition for a callback to be invoked when
 * an item in this view has been selected.
 */
public interface OnItemSelectedListener {
    /**
     *
     * @param country
     */
    void onItemSelected(Country country);

    /**
     *
     */
    void onNothingSelected();
}