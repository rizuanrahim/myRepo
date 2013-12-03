/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package training.pictag.domain;

import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author User
 */
public class UploadPicture {
    private String id;
    private Date captureDate;
    private User owner;
    private String imageLocation;
    private  BigDecimal latitude;
    private  BigDecimal longitude;
    private String gpsCoordinate;
    private String remarks;
    
}
