package cmpe.dos.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import cmpe.dos.entity.embed.WorkerId;

@Entity
public class Worker {

    @Id
    @Column(length = 20)
    private String username;
    
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name="username")
    private User user;
    
    @OneToOne
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    
    
   
}