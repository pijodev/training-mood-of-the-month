package io.takima.ProjectMOTM;

import lombok.*;
import org.hibernate.annotations.*;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;


@Table(name="MOTM_Answer", schema="projectmotm")
@Setter
@Getter
@Entity
public class MOTM_Answer {

    public enum Grade {
        A(5.0),
        B(4.0),
        C(3.0),
        D(2.0),
        E(1.0);

        private double value;

        Grade(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    /*@Column(name="uuid", unique = true, nullable = false)
    @GeneratedValue
    @Id
    private Integer uuid;*/
    @Column(name="message", nullable = false)
    private String message;
    @Column(name="grade", nullable = false)
    private Grade grade;
    @Column(name="Employee_id", nullable = false)
    private Integer Employee_id;
    @Column(name="MOTM_id", nullable = false)
    private Integer MOTM_id;
    @Column(name="created_at", nullable = false)
    private Date created_at;
    @Column(name="updated_at", nullable = false)
    private Date updated_at;

}