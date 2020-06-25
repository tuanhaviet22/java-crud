package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.SanPham;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-25T16:22:46")
@StaticMetamodel(DanhMuc.class)
public class DanhMuc_ { 

    public static volatile SingularAttribute<DanhMuc, String> tenDanhMuc;
    public static volatile SingularAttribute<DanhMuc, Integer> id;
    public static volatile CollectionAttribute<DanhMuc, SanPham> sanPhamCollection;

}