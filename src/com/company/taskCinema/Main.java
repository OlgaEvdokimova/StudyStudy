package com.company.taskCinema;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Создать класс Cinema с внутренним классом,
     * с помощью объектов которого можно хранить информацию об адресах кинотеатров, фильмах и времени начала сеансов.
     * у кинотеатра есть залы, у залов есть сеансы, сеанс - это записьь, которая ктмбинирует в себе дату, время и фильм
     */
    public static void main(String[] args) {
        Session.Film film1 = new Session.Film("Форсаж");
        Session.Film film2 = new Session.Film("ЛюдиХ");
        Session.Film film3 = new Session.Film("Незваные");
        Session.Film film4 = new Session.Film("Лунтик");
//        List<Session.Film> filmsSov = new ArrayList<>() {
//            {
//                add(film1);
//                add(film2);
//
//            }
//        };
        List<String> date1 = new ArrayList<>() {
            {
                add("1 Ноября");
                add("2 Ноября");
                add("3 Ноября");
            }
        };
        String time1 = "13:50";
        String time2 = "17:50";


        String time3 = "11:50";
        String time4 = "19:50";

        Session session1SovL = new Session("1 Ноября", time1, film1);
        Session session2SovL = new Session("2 Ноября", time1, film1);
        Session session3SovL = new Session("3 Ноября", time1, film2);

        List<Session> sessionsSovL = new ArrayList<>() {
            {
                add(session1SovL);
                add(session2SovL);
                add(session3SovL);

            }
        };
        CinemaHall cinemaHallSovL = new CinemaHall("Малый зал", sessionsSovL);

        Session session1B = new Session("1 Ноября", time2, film2);
        Session session2B = new Session("2 Ноября", time2, film3);
        Session session3B = new Session("3 Ноября", time2, film3);
        List<Session> sessionsSovB = new ArrayList<>() {
            {
                add(session1B);
                add(session2B);
                add(session3B);

            }
        };
        CinemaHall cinemaHallSovB = new CinemaHall("Большой зал", sessionsSovB);
        List<CinemaHall> cinemaHalls = new ArrayList<>();
        cinemaHalls.add(cinemaHallSovL);
        cinemaHalls.add(cinemaHallSovB);


        Cinema cinemaSov = new Cinema("\"им. Калинина\"", Cinema.Address.SOVETSKAYA, cinemaHalls);


//        List<Session.Film> filmsBel = new ArrayList<>() {
//            {
//                add(film1);
//                add(film3);
//            }
//        };

        Session session1BelL = new Session("1 Ноября", time1, film1);
        Session session2BelL = new Session("2 Ноября", time1, film3);
        Session session3BelL = new Session("3 Ноября", time1, film4);

        List<Session> sessionsBelL = new ArrayList<>() {
            {
                add(session1SovL);
                add(session2SovL);
                add(session3SovL);

            }
        };
        CinemaHall cinemaHallBelL = new CinemaHall("Малый зал", sessionsSovL);
        List<CinemaHall> cinemaHallsBel = new ArrayList<>();
        cinemaHallsBel.add(cinemaHallBelL);

        Cinema cinemaBelitsa = new Cinema("\"Мир\"", Cinema.Address.BELITSA, cinemaHallsBel);


//        Cinema cinemaOkt = new Cinema("\"Октябрь\"", Cinema.Address.OKTYABR, filmsOkt);
//
        List<Cinema> cinemas = new ArrayList<>() {{
            add(cinemaSov);
            add(cinemaBelitsa);
            // add(cinemaOkt);
        }};
        Poster poster = new Poster(cinemas);
        System.out.println(poster);

    }
}
