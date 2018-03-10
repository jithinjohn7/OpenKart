package com.example.sbarai.openkart.Models;

import android.location.Location;

import com.google.firebase.database.Exclude;

import java.util.Collections;
import java.util.List;


// TODO : DELETE THIS FILE

/**
 * Created by sbarai on 1/18/18.
 */

public class ProspectOrder {

    public String creatorKey;
    public Object dateTime; //Will be stored as milliseconds on server therefore long.
    private double locLat;
    private double locLon;
    private float colabRadius;
    private String desiredStore;
    private long orderDate; //Can be easily converted to String from java.time
    private float targetTotal;
    private List<Collaborator> collaborators;
    private List<Comment> comments;
    private int status;

    public String getCreatorKey() {
        return creatorKey;
    }

    public void setCreatorKey(String userKey) {
        this.creatorKey = userKey;
    }

    @Exclude
    public void setLocation(Location location){
        locLat = location.getLatitude();
        locLon = location.getLongitude();
    }

    @Exclude
    public Location getLocation(){
        Location location = new Location("");
        location.setLatitude(locLat);
        location.setLongitude(locLon);
        return location;
    }

    public double getLocLat() {
        return locLat;
    }

    public void setLocLat(double locLat) {
        this.locLat = locLat;
    }

    public double getLocLon() {
        return locLon;
    }

    public void setLocLon(double locLon) {
        this.locLon = locLon;
    }

    public void setColabRadius(float radius){
        colabRadius = radius;
    }

    public float getColabRadius(){
        return colabRadius;
    }

    public void setDesiredStore(String store){
        desiredStore = store;
    }

    public String getDesiredStore(){
        return desiredStore;
    }

    public void setOrderDate(long date){
        orderDate = date;
    }

    public long getOrderDate(){
        return orderDate;
    }

    public float getTargetTotal() {
        return targetTotal;
    }

    public void setTargetTotal(float targetTotal) {
        this.targetTotal = targetTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Collaborator> getCollaborators(){
        if (collaborators == null){
            return Collections.EMPTY_LIST;
        }
        return collaborators;
    }

    public void setCollaborators(List<Collaborator> collaborators){
        this.collaborators = collaborators;
    }

}
