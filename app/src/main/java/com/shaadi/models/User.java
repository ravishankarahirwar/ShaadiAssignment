package com.shaadi.models;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 13-01-2019
 */
public class User {
    private String gender;
    private String email;
    private String phone;
    private String cell;
    private Name name;
    private Location location;
    private Picture picture;
    private Dob dob;

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }


    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public class Name {
        String title;
        String first;
        String last;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }

    public class Coordinates {
        private String latitude;

        private String longitude;

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLatitude() {
            return this.latitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLongitude() {
            return this.longitude;
        }
    }


    public class Timezone {
        private String offset;

        private String description;

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public String getOffset() {
            return this.offset;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }
    }

    public class Location {
        private String street;

        private String city;

        private String state;

        private int postcode;

        private Coordinates coordinates;

        private Timezone timezone;

        public void setStreet(String street) {
            this.street = street;
        }

        public String getStreet() {
            return this.street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }

        public void setPostcode(int postcode) {
            this.postcode = postcode;
        }

        public int getPostcode() {
            return this.postcode;
        }

        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        public Coordinates getCoordinates() {
            return this.coordinates;
        }

        public void setTimezone(Timezone timezone) {
            this.timezone = timezone;
        }

        public Timezone getTimezone() {
            return this.timezone;
        }
    }

    public class Picture {
        private String large;

        private String medium;

        private String thumbnail;

        public void setLarge(String large) {
            this.large = large;
        }

        public String getLarge() {
            return this.large;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getMedium() {
            return this.medium;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getThumbnail() {
            return this.thumbnail;
        }
    }

    public class Dob {
        private String date;

        private int age;

        public void setDate(String date) {
            this.date = date;
        }

        public String getDate() {
            return this.date;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }
    }
}
