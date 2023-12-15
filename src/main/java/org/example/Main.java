package org.example;

import dao.*;
import dao.datawarehouse.LotteryDAOWareHouse;
import dao.staging.LotteryResultDAOStaging;
import entity.Date_dim;
import entity.Lottery_Result;
import entity.Province_Dim;
import entity.Reward_dim;

public class Main {
    public static void main(String[] args) {

        LogDAO logDAO = new LogDAO();
        ControlDAO controlDAO = new ControlDAO();
        LotteryDAOWareHouse lotteryWh = new LotteryDAOWareHouse();
        LotteryResultDAOStaging lotteryMart = new LotteryResultDAOStaging();

        CSVReader  reader= new CSVReader();
        CSVReader_Reward reader_reward =new CSVReader_Reward();
        CSVResder_Province resder_province =new CSVResder_Province();
    }
}