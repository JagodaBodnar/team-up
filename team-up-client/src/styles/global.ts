const sizes = {
    mobile: 576,
    tablet: 768,
    laptop: 992,
    desktop: 1200
};

export const device = {
    mobile: `(max-width: ${sizes.mobile}px)`,
    tablet: `(min-width: ${sizes.mobile + 1}px) and (max-width: ${sizes.tablet}px)`,
    laptop: `(min-width: ${sizes.tablet + 1}px) and (max-width: ${sizes.laptop}px)`,
    desktop: `(min-width: ${sizes.laptop + 1}px) and (max-width: ${sizes.desktop}px)`,
    desktopXL: `(min-width: ${sizes.desktop + 1}px)`
};
