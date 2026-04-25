import React from 'react';
// 1. Importe o View diretamente do react-native
import { ScrollView, StyleSheet, Text, View } from 'react-native'; 
import { ThemedView } from '@/components/themed-view';
import { ThemedText } from '@/components/themed-text';

const UserImage = ({ nome }: { nome: string }) => {
    const inicial = nome ? nome.charAt(0).toUpperCase() : '?';

    return (
        <View>
            <Text>
                {inicial}
            </Text>
        </View>
    )
}


export default function UserAccount() {
    const nomeUsuario = "Fabiano"
    const tipoDocumento = null
    const eatado = "SP*"
    const documentacaoInscricao = 123.456

    if (tipoDocumento)
    {
        
    }
    

    
    return (
        <ScrollView style={styles.container}>
            <ThemedView style={styles.content}>

                <ThemedText type="title">Olá, {nomeUsuario}</ThemedText>

                <ThemedView style={styles.infoBox}>
                    <ThemedText style={styles.textWhite}>
                        Advogado OAB/XX 123.456
                    </ThemedText>

                    <ThemedText style={styles.textWhite}>

                    </ThemedText>

                </ThemedView>

            </ThemedView>
        </ScrollView>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },
    content: {
        padding: 20,
        paddingTop: 60, // Para não ficar embaixo da barra do celular
    },
    infoBox: {
        marginTop: 20,
        gap: 10,
    },
    textWhite: {
        color: 'white',
    },
});
