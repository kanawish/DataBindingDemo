package com.android_montreal.databindingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android_montreal.databindingdemo.BR;

/**
 * Created by kanawish on 15-06-29.
 */
public class Person extends BaseObservable {
    String firstName ;
    String lastName ;

    float weight ;
    int age ;

    public Person() {
    }

    public Person(String firstName, String lastName, float weight, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.age = age;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.android_montreal.databindingdemo.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    // etc...

    @Bindable
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        notifyPropertyChanged(BR.weight);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    // etc...
}
