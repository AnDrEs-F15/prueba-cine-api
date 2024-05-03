package com.cinema.domain.mappers;

import com.cinema.domain.dto.BookingDto;
import com.cinema.infrastructure.entities.Booking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IBookingMapper {
   @Mappings({
           @Mapping(target = "client" , source = "entity.client.id"),
           @Mapping(target = "room" ,source = "entity.room.id"),
           @Mapping(target = "schedule" , source = "entity.schedule.id"),
           @Mapping(target = "movie", source = "entity.movie.id")
   })
    BookingDto toDto (Booking entity);
    List<BookingDto> toDto (List<Booking> entity );
}
