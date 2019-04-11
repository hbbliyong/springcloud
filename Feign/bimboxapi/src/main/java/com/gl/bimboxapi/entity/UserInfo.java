package com.gl.bimboxapi.entity;

import java.util.List;

public class UserInfo {
    /**
     * data : {"username":"ArcAlNKgvQ","email":"liliben@cabrtech.com","phoneNumber":null,"realName":null,"gender":null,"qqNumber":null,"birthDate":null,"company":"","department":null,"title":null,"country":null,"province":null,"city":null,"district":null,"address":null,"postcode":null,"avatarLink":null,"cardSetting":"{\"realName\":true,\"phoneNumber\":true,\"title\":true,\"department\":true,\"company\":true,\"address\":true,\"avatarLink\":true}","enabled":true,"education":null,"workTime":null,"titleCertificate":null,"professionCertificate":null,"resumes":[],"remark":null,"createAt":1540975026000,"updateAt":1540975026000}
     * x_ref : {"users":[]}
     */

    private DataBean data;
    private XRefBean x_ref;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public XRefBean getX_ref() {
        return x_ref;
    }

    public void setX_ref(XRefBean x_ref) {
        this.x_ref = x_ref;
    }

    public static class DataBean {
        /**
         * username : ArcAlNKgvQ
         * email : liliben@cabrtech.com
         * phoneNumber : null
         * realName : null
         * gender : null
         * qqNumber : null
         * birthDate : null
         * company :
         * department : null
         * title : null
         * country : null
         * province : null
         * city : null
         * district : null
         * address : null
         * postcode : null
         * avatarLink : null
         * cardSetting : {"realName":true,"phoneNumber":true,"title":true,"department":true,"company":true,"address":true,"avatarLink":true}
         * enabled : true
         * education : null
         * workTime : null
         * titleCertificate : null
         * professionCertificate : null
         * resumes : []
         * remark : null
         * createAt : 1540975026000
         * updateAt : 1540975026000
         */

        private String username;
        private String email;
        private Object phoneNumber;
        private Object realName;
        private Object gender;
        private Object qqNumber;
        private Object birthDate;
        private String company;
        private Object department;
        private Object title;
        private Object country;
        private Object province;
        private Object city;
        private Object district;
        private Object address;
        private Object postcode;
        private Object avatarLink;
        private String cardSetting;
        private boolean enabled;
        private Object education;
        private Object workTime;
        private Object titleCertificate;
        private Object professionCertificate;
        private Object remark;
        private long createAt;
        private long updateAt;
        private List<?> resumes;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Object getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(Object phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Object getRealName() {
            return realName;
        }

        public void setRealName(Object realName) {
            this.realName = realName;
        }

        public Object getGender() {
            return gender;
        }

        public void setGender(Object gender) {
            this.gender = gender;
        }

        public Object getQqNumber() {
            return qqNumber;
        }

        public void setQqNumber(Object qqNumber) {
            this.qqNumber = qqNumber;
        }

        public Object getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Object birthDate) {
            this.birthDate = birthDate;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public Object getDepartment() {
            return department;
        }

        public void setDepartment(Object department) {
            this.department = department;
        }

        public Object getTitle() {
            return title;
        }

        public void setTitle(Object title) {
            this.title = title;
        }

        public Object getCountry() {
            return country;
        }

        public void setCountry(Object country) {
            this.country = country;
        }

        public Object getProvince() {
            return province;
        }

        public void setProvince(Object province) {
            this.province = province;
        }

        public Object getCity() {
            return city;
        }

        public void setCity(Object city) {
            this.city = city;
        }

        public Object getDistrict() {
            return district;
        }

        public void setDistrict(Object district) {
            this.district = district;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getPostcode() {
            return postcode;
        }

        public void setPostcode(Object postcode) {
            this.postcode = postcode;
        }

        public Object getAvatarLink() {
            return avatarLink;
        }

        public void setAvatarLink(Object avatarLink) {
            this.avatarLink = avatarLink;
        }

        public String getCardSetting() {
            return cardSetting;
        }

        public void setCardSetting(String cardSetting) {
            this.cardSetting = cardSetting;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public Object getEducation() {
            return education;
        }

        public void setEducation(Object education) {
            this.education = education;
        }

        public Object getWorkTime() {
            return workTime;
        }

        public void setWorkTime(Object workTime) {
            this.workTime = workTime;
        }

        public Object getTitleCertificate() {
            return titleCertificate;
        }

        public void setTitleCertificate(Object titleCertificate) {
            this.titleCertificate = titleCertificate;
        }

        public Object getProfessionCertificate() {
            return professionCertificate;
        }

        public void setProfessionCertificate(Object professionCertificate) {
            this.professionCertificate = professionCertificate;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public long getCreateAt() {
            return createAt;
        }

        public void setCreateAt(long createAt) {
            this.createAt = createAt;
        }

        public long getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(long updateAt) {
            this.updateAt = updateAt;
        }

        public List<?> getResumes() {
            return resumes;
        }

        public void setResumes(List<?> resumes) {
            this.resumes = resumes;
        }
    }

    public static class XRefBean {
        private List<?> users;

        public List<?> getUsers() {
            return users;
        }

        public void setUsers(List<?> users) {
            this.users = users;
        }
    }
}
