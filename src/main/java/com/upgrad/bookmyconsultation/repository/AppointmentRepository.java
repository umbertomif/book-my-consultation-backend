package com.upgrad.bookmyconsultation.repository;

import com.upgrad.bookmyconsultation.entity.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, String> {

	List<Appointment> findByUserId(String userId);

	Appointment findByDoctorIdAndTimeSlotAndAppointmentDate(String doctorId, String timeSlot, String appointmentDate);
}
