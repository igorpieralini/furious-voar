# FURIOUS-FLY Plugin 🕊️

**VIPFly** is a lightweight Minecraft Paper plugin (version 1.8.8) that automatically enables **flight** for players when they enter the **VIP world**. Developed in **Java** using **Maven**, it’s simple to configure and enhances the VIP experience on your server.

## Features ✨

* Automatic fly activation upon entering the VIP world.
* Seamless integration with Paper 1.8.8 servers.
* Easy to configure worlds and permissions.
* Minimal performance impact.

## Installation 🚀

1. Download the latest `VIPFly.jar` from the repository or build it using Maven:

```bash
mvn clean package
```

2. Place the `.jar` file in your server’s `plugins` folder.
3. Restart or reload your server.

---

## Configuration ⚙️

Edit the `config.yml` file (generated in the plugin folder after the first run):

```yaml
vip-world: "vipworld"
enable-fly: true
```

* `vip-world`: Name of the world where fly should be enabled.
* `enable-fly`: Set to `true` to automatically allow flight.

---

## Permissions 🔑

* `vipfly.use` – Allows players to fly automatically in the VIP world.

> Make sure your VIP group in your permissions plugin has this permission.

---

## Development 🛠️

* Java 8 compatible.
* Built with Maven.
* Developer: **Igor Pieralini**
