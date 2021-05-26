/*
 * *********************************************************************
 *  Copyright (c) 2017, Ministry of Education, BC.
 *
 *  All rights reserved.
 *    This information contained herein may not be used in whole
 *    or in part without the express written consent of the
 *    Government of British Columbia, Canada.
 *
 *  Revision Control Information
 *  File:                $Id::                                                 $
 *  Date of Last Commit: $Date::                                               $
 *  Revision Number:     $Rev::                                                $
 *  Last Commit by:      $Author::                                             $
 *
 * ***********************************************************************
 */
package ca.bc.gov.educ.isd.traxadaptor.dao.tsw.impl;

import javax.validation.constraints.Size;
import java.io.Serializable;

import static ca.bc.gov.educ.isd.eis.common.DatabaseConstants.*;

/**
 * An auto generated entity for the TSW_TRAN_DEMOG_VW view which is a view
 * created in the ISD database and linked to the TRAX database tsw_tran_demog
 * table using the database link. JPA access is on attributes directly. The
 * attributes in this entity are used to fulfill data requests for the
 * Transcript, XML Transcript services, and Exam services.
 *
 * @author CGI Information Management Consultants Inc.
 */
public class TswTranDemogEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studNo;

    private String firstName;

    private String middleName;

    private String lastName;

    private Long birthdate;

    private String localId;

    private Character studGender;

    private String mincode;

    private String studGrade;

    private String gradDate;

    private String gradReqtYear;

    private Long updateDt;

    private String logoType;

    private String gradMsgTxt;

    private Character gradFlag;

    private Character currentFormerFlag;

    public TswTranDemogEntity() {
    }

    public String getStudNo() {
        return studNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getBirthdate() {
        return birthdate;
    }

    public String getLocalId() {
        return localId;
    }

    public Character getStudGender() {
        return studGender;
    }

    public String getMincode() {
        return mincode;
    }

    public String getStudGrade() {
        return studGrade;
    }

    public String getGradDate() {
        return gradDate;
    }

    public String getGradReqtYear() {
        return gradReqtYear;
    }

    public Long getUpdateDt() {
        return updateDt;
    }

    public String getLogoType() {
        return logoType;
    }

    public String getGradMsg() {
        return gradMsgTxt;
    }

    public Character getGradFlag() {
        return gradFlag;
    }

    public Character getCurrentFormerFlag() {
        return currentFormerFlag;
    }
}