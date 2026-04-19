import { Image } from 'expo-image';
import { Platform, StyleSheet } from 'react-native';

import { Collapsible } from '@/components/ui/collapsible';
import { ExternalLink } from '@/components/external-link';
import ParallaxScrollView from '@/components/parallax-scroll-view';
import { ThemedText } from '@/components/themed-text';
import { ThemedView } from '@/components/themed-view';
import { IconSymbol } from '@/components/ui/icon-symbol';
import { Fonts } from '@/constants/theme';
import { Text } from 'react-native';

export default function TabTwoScreen() {
  return (
    <ParallaxScrollView
      headerBackgroundColor={{ light: '', dark: '' }}
      headerImage={<></>}>
      <ThemedView style={styles.titleContainer}>
        <ThemedText type="title">lorem</ThemedText>
      </ThemedView>

      <ThemedText>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit auctor dui, a efficitur nisl. Donec in nunc sed enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis. Donec eget ligula a enim efficitur convallis.
      </ThemedText>



    </ParallaxScrollView>
  );
}

const styles = StyleSheet.create({
  titleContainer: {
    flexDirection: 'row',
    gap: 8,
  },
});
