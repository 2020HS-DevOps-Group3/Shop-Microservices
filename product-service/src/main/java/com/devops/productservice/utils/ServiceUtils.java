package com.devops.productservice.utils;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ServiceUtils {

    private static final ModelMapper modelMapper;

    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setPropertyCondition(Conditions.isNotNull())
                .setMatchingStrategy(MatchingStrategies.STRICT);
    }

    private ServiceUtils() {
    }

    public static <D, T> D mapModel(final T subject, Class<D> tClass) {
        return modelMapper.map(subject, tClass);
    }

    public static <D, T> List<D> mapModels(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> mapModel(entity, outCLass))
                .collect(Collectors.toList());
    }

    public static <S, D> D mapModel(final S source, D destination) {
        modelMapper.map(source, destination);
        return destination;
    }

    public static <D, T> D standardModelMapper(final T subject, Class<D> tClass) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
        return modelMapper.map(subject, tClass);
    }

    public static <D, T> List<D> standardModelsMappers(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> standardModelMapper(entity, outCLass))
                .collect(Collectors.toList());
    }

    public static <S, D> D standardModelMapper(final S source, D destination) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
        modelMapper.map(source, destination);
        return destination;
    }

    public static <D, T> D looseModelMapper(final T subject, Class<D> tClass) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(subject, tClass);
    }

    public static <D, T> List<D> looseModelsMappers(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> looseModelMapper(entity, outCLass))
                .collect(Collectors.toList());
    }

    public static <S, D> D looseModelMapper(final S source, D destination) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        modelMapper.map(source, destination);
        return destination;
    }
}
