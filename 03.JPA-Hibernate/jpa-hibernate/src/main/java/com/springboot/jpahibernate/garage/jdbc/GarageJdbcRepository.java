package com.springboot.jpahibernate.garage.jdbc;

import com.springboot.jpahibernate.garage.Garage;
import com.springboot.jpahibernate.garage.GarageToInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GarageJdbcRepository {

    @Autowired
    private JdbcTemplate garageJdbcTemplate;

    public void insertHardCoded() {
        garageJdbcTemplate.update(INSERT_RE);
        garageJdbcTemplate.update(INSERT_RR);
        garageJdbcTemplate.update(INSERT_BMW);
        garageJdbcTemplate.update(INSERT_MAYBACH);
    }

    public void insertUsingParams(GarageToInsert garage) {
        garageJdbcTemplate.update(INSERT_CUSTOM_QUERY, garage.getId(), garage.getCompany(), garage.getName());
    }

    public void deleteUsingParams(int id) {
        garageJdbcTemplate.update(DELETE_RR, id);
    }

    public Garage queryVehicleById(int id) {
        // ResultSet -> Bean (Using RowMapper)
        return garageJdbcTemplate.queryForObject(QUERY_VEHICLE_BY_ID, new BeanPropertyRowMapper<>(Garage.class), id);
    }


    static final String INSERT_RE =
            """
                            insert into garage (id, company, name) values
                            (
                            1, 'Royal Enfield', 'Classic 350-Chrome Bronze'
                            );
                    """;
    static final String INSERT_RR =
            """
                    insert into garage (id, company, name) values
                    (
                    2, 'Land Rover', 'Range Rover-Velar'
                    );
                    """;
    static final String INSERT_BMW =
            """
                    insert into garage (id, company, name) values
                    (
                    3, 'BMW', '760-LI'
                    );
                    """;
    static final String INSERT_MAYBACH =
            """
                    insert into garage (id, company, name) values
                    (
                    4, 'Mercedes', 'Maybach gls 600'
                    );
                    """;

    static final String INSERT_CUSTOM_QUERY =
            """
                    insert into garage(id, company, name) values
                    (?,?,?);
                    """;

    static final String DELETE_RR =
            """
                    delete from garage where id = ?;
                    """;

    static final String QUERY_VEHICLE_BY_ID =
            """
                    select * from garage where id = ?
                    """;
}
