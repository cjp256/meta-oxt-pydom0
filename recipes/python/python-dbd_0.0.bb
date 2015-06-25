DESCRIPTION = "Python replacement for dbd and db-tools"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

SRC_URI = "git://github.com/cjp256/pydbd.git;protocol=git;branch=master \
           file://dbd.initscript \
"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
PV = "0.0+git${SRCPV}"

inherit setuptools update-rc.d

INITSCRIPT_NAME = "dbd"
INITSCRIPT_PARAMS = "defaults 25"

do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/dbd.initscript ${D}${sysconfdir}/init.d/dbd
}

PACKAGES += "\
    ${PN}-dbd \
    ${PN}-dbtools \
"

FILES_${PN} = "\
    /usr/lib \
"

FILES_${PN}-dbd = "\
    /etc/init.d/dbd \
    /usr/bin/dbd \
"

FILES_${PN}-dbtools = "\
    /usr/bin/db-* \
"

RDPENDS_${PN}-dbd = "python-dbd python-core python-shell python-re python-lang python-io python-math python-dbus python-threading python-logging python-argparse python-json python-pygobject python-syslog python-pyxs"

RDPENDS_${PN}-dbtools = "python-dbd python-core python-shell python-lang python-io python-math python-dbus python-threading python-json"

PR="r8"
