# Mensury Edits - IntelliJ IDEA plugin

[//]: # (TODO: Upload plugin)
[//]: # (![Build]&#40;https://github.com/dont-doubt/Mensury-plugin/workflows/Build/badge.svg&#41;)
[//]: # ([![Version]&#40;https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg&#41;]&#40;https://plugins.jetbrains.com/plugin/PLUGIN_ID&#41;)
[//]: # ([![Downloads]&#40;https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg&#41;]&#40;https://plugins.jetbrains.com/plugin/PLUGIN_ID&#41;)

<!-- Plugin description -->
This plugin has been written by Rivta for Mensury client developement purposes.

**Supports**:
- Mensury locale language support (for any .melang files)
<!-- Plugin description end -->


## Installation
[//]: # (TODO: Upload plugin)
[//]: # (- Using IDE built-in plugin system:)
[//]: # (  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Mensury-plugin"</kbd> >)
[//]: # (  <kbd>Install Plugin</kbd>)
- Manually:
  Download the [latest release](https://github.com/dont-doubt/Mensury-plugin/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## For developers
- To get the .zip plugin as output, you shall run `buildPlugin` task and get it inside <kbd>build/distributions</kbd> folder.


### Developer ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Get familiar with the [template documentation][template].
- [x] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [ ] Verify the [pluginGroup](gradle.properties), [plugin ID](src/main/resources/META-INF/plugin.xml) and [sources package](./src/main/kotlin).
- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [ ] Set the Plugin ID in the above README badges.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

[template]: https://github.com/JetBrains/intellij-platform-plugin-template