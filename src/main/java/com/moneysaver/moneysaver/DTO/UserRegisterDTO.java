package com.moneysaver.moneysaver.DTO;

     import lombok.Data;

        import java.util.ArrayList;
        import java.util.Date;
        import java.util.List;

@Data
public class UserRegisterDTO {

    public Long idUser ;
    public String username;
    public String password ;
    public Date CreateDate ;


}
