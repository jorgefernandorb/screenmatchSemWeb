package br.com.tjSpring.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); //devolve algo generico, algo que não sei mas que terá que ser retornado
}
