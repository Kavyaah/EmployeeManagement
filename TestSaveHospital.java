package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestSaveHospital {
public static void main(String[] args) {
	Hospital hospital=new Hospital();
	HospitalService service=new HospitalService();
	hospital.setH_name("Jaydev");
	hospital.setH_website("www.Jaydev.com");
	service.SaveHospital(hospital);
}
}
