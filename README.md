# About

A selection of python3 packages useful for getting runtime information and sending it over a serial interface. Perfect 
starting point for establishing command/telemetry. 

### Instructions

```
> git clone <repo-url>
> git checkout -b mickledore

# setup build directory, then ...
> bitbake-layers add-layer <layer-name>

# add following to <build-directory/conf/local.conf>
EXTRA_IMAGE_FEATURES += " psutil pyserial"
```
