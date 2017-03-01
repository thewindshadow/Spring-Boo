package com.battle;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * Created by Bing.Z on 2017/3/1.
 */
public class RedisObjectSerializer implements RedisSerializer<Object> {

    protected static final byte[] EMPTY_ARRAY = new byte[0];
    private Converter<Object,byte[]> serializer = new SerializingConverter(); //序列化转换器
    private Converter<byte[],Object> deserializer = new DeserializingConverter();//反序列化转换器

    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if(o == null) return EMPTY_ARRAY;
        try {
            return serializer.convert(o);
        } catch (Exception e) {
            return EMPTY_ARRAY;
        }
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if(ArrayUtils.isEmpty(bytes)) return null;
        try {
            return deserializer.convert(bytes);
        } catch (Exception e) {
            throw new SerializationException("cannot deserializer",e);
        }
    }
}
