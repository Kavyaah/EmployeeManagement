package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestUpdateHospital {
public static void main(String[] args) {
	Hospital hospital=new Hospital();
	hospital.setH_name("Narayana");
	hospital.setH_website("www.narayana.com");
	HospitalService service=new HospitalService();
	service.updateHospitalById(1, hospital);
}
}
