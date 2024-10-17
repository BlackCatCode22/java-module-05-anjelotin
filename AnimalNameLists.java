package angelo.zoo.com;

import java.util.ArrayList;

public class AnimalNameLists {
    private ArrayList<String> hyenaNameList;
    private ArrayList<String> lionNameList;
    private ArrayList<String> bearNameList;
    private ArrayList<String> tigerNameList;

    public AnimalNameLists() {
        hyenaNameList = new ArrayList<>();
        lionNameList = new ArrayList<>();
        bearNameList = new ArrayList<>();
        tigerNameList = new ArrayList<>();
    }

    public ArrayList<String> getHyenaNameList() {
        return hyenaNameList;
    }

    public ArrayList<String> getLionNameList() {
        return lionNameList;
    }

    public ArrayList<String> getBearNameList() {
        return bearNameList;
    }

    public ArrayList<String> getTigerNameList() {
        return tigerNameList;
    }

    public void setHyenaNameList(ArrayList<String> names) {
        hyenaNameList = names;
    }

    public void setLionNameList(ArrayList<String> names) {
        lionNameList = names;
    }

    public void setBearNameList(ArrayList<String> names) {
        bearNameList = names;
    }

    public void setTigerNameList(ArrayList<String> names) {
        tigerNameList = names;
    }
}
