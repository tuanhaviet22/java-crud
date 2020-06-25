package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.DanhMuc;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-25T16:22:46")
@StaticMetamodel(SanPham.class)
public class SanPham_ { 

    public static volatile SingularAttribute<SanPham, String> summary;
    public static volatile SingularAttribute<SanPham, Float> price;
    public static volatile SingularAttribute<SanPham, String> name;
    public static volatile SingularAttribute<SanPham, DanhMuc> danhMucId;
    public static volatile SingularAttribute<SanPham, Integer> id;

}