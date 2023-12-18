package nelio_alves.Denumerações.Exercise1.entities;

import nelio_alves.Denumerações.Exercise1.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    List<HourContract> contracts = new ArrayList<>();


    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public void income(Integer month, Integer year) {
        Calendar cal = Calendar.getInstance();
        int cont = 0;
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int contractMonth = cal.get(Calendar.MONTH) + 1;
            int contractYear = cal.get(Calendar.YEAR);

            cont += c.totalValue();
        }
    }

}
