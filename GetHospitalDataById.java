package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class GetHospitalDataById {
public static void main(String[] args) {
HospitalService service=new HospitalService();
Hospital hospital=service.getHospitalById(1);
System.out.println(hospital.getH_id());
System.out.println(hospital.getH_name());
System.out.println(hospital.getH_website());
}
}
