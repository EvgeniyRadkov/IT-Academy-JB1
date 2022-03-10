package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.model.Train;
import com.gmail.radzkovevgeni.repository.FillFieldsTrain;

import java.util.Scanner;

public class FillFieldsTrainImpl implements FillFieldsTrain {

    private static FillFieldsTrainImpl instance;

    private FillFieldsTrainImpl() {
    }

    public static FillFieldsTrainImpl getInstance(){
        if (instance==null){
            instance=new FillFieldsTrainImpl();
        }
    return instance;
    }

    @Override
    public Train getTrain() {

            Scanner in = new Scanner(System.in);
            System.out.println("Write train departure date in format  dd.mm.yyyy");
            String ed1 = in.nextLine();

            System.out.println("Write train departure clock in format  hh.mm");
            String ed2 = in.nextLine();

            System.out.println("Write train travel time in format  hh");
            String ed3 = in.nextLine();
            in.close();

            Train train = new Train(ed1,ed2,ed3);

        return train;
    }
}
