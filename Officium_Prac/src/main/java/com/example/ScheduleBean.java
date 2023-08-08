package com.example;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleModel;

@ManagedBean(name = "scheduleBean")
@RequestScoped
public class ScheduleBean {

    private ScheduleModel eventModel;

    @PostConstruct
    public void init() {
        eventModel = new DefaultScheduleModel();
        // Our model is empty as we only want to display dates
    }

    public ScheduleModel getEventModel() {
        return eventModel;
    }
}
