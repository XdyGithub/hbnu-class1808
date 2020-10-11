package cn.hbnu.edu.uml;

import java.util.Date;

public class BasePojo {
    private Date created; // 创建日期
    private Date updated; // 更新日期

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
